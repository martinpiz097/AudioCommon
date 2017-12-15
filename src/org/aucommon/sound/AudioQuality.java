/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aucommon.sound;

import javax.sound.sampled.AudioFormat;

/**
 *
 * @author martin
 */
public class AudioQuality {
    public static final AudioFormat PERFECT = new AudioFormat(96000.0f, 24, 2, true, false);
    public static final AudioFormat THE_BEST = new AudioFormat(48000.0f, 24, 2, true, false);
    public static final AudioFormat HIGH = new AudioFormat(44100.0f, 8, 2, true, false);
    public static final AudioFormat NORMAL = new AudioFormat(
            AudioFormat.Encoding.PCM_SIGNED, 22050.0f, 16, 1, 2, 22050.0f, false);
    public static final AudioFormat LOW = new AudioFormat(
            AudioFormat.Encoding.PCM_SIGNED, 11025.0f, 8, 1, 1, 11025.0f, false);
    public static final AudioFormat POOR = new AudioFormat(
            AudioFormat.Encoding.PCM_SIGNED, 8820.0f, 8, 1, 1, 8820.0f, false);
}
