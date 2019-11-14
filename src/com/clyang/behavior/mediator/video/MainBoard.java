package com.clyang.behavior.mediator.video;

import com.clyang.create.abstractfactory.Cpu;

public class MainBoard implements Mediator {
    private CDDriver cdDriver;
    private CPU cpu;
    private VideoCard videoCard;
    private SoundCard soundCard;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof CDDriver) {
            operateCDDriverReadData((CDDriver) colleague);
        } else if (colleague instanceof CPU) {
            operateCPU((CPU) colleague);
        }
    }

    private void operateCDDriverReadData(CDDriver cd) {
        String data = cd.getData();
        cpu.executeData(data);
    }

    private void operateCPU(CPU cpu) {
        String videoData = cpu.getVideoData();
        String soudData = cpu.getSoundData();
        videoCard.showData(videoData);
        soundCard.soundData(soudData);
    }
}
