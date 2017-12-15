/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aucommon.sound;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import static org.aucommon.sound.AudioInfo.DEFAULT_FORMAT;

/**
 *
 * @author martin
 */
public class Speaker extends AudioInterface {
    private SourceDataLine driver;
    private SourceDataLine.Info driverInfo;

    private AudioFormat format;
    
    public Speaker() throws LineUnavailableException {
        super();
        driverInfo = new DataLine.Info(SourceDataLine.class, DEFAULT_FORMAT);
        driver = (SourceDataLine) AudioSystem.getLine(driverInfo);
    }

    public Speaker(AudioFormat quality) throws LineUnavailableException {
        configure(quality);
    }

    public SourceDataLine getDriver() {
        return driver;
    }
    
    @Override
    public void configure(AudioFormat quality) throws LineUnavailableException {
        this.format = quality;
        driverInfo = new DataLine.Info(SourceDataLine.class, format);
        driver = (SourceDataLine) AudioSystem.getLine(driverInfo);
    }

    @Override
    public boolean isOpen(){
        return driver.isOpen();
    }
    
    @Override
    public void open() throws LineUnavailableException{
        driver.open(format == null ? DEFAULT_FORMAT : format);
        driver.start();
    }

    @Override
    public void stop(){
        driver.stop();
    }
    
    public void playAudio(byte[] audioBuff){
        if(audioBuff == null)
            return;
        driver.write(audioBuff, 0, audioBuff.length);
    }
    
}
