/*
 *  Copyright (C) 2010-2018 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.exporters.modes;

/**
 *
 * @author JPEXS
 */
public enum SoundExportMode {

    MP3_WAV_FLV(true, true, true, false), FLV(false, false, true, false), MP3_WAV(true, true, false, false), WAV(false, true, false, false), BMLSWF(false, false, false, true);

    private final boolean mp3, wav, flv, bmlswf;

    private SoundExportMode(boolean mp3, boolean wav, boolean flv, boolean bmlswf) {
        this.mp3 = mp3;
        this.wav = wav;
        this.flv = flv;
        this.bmlswf = bmlswf;
    }

    public boolean hasMP3() {
        return mp3;
    }

    public boolean hasWav() {
        return wav;
    }

    public boolean hasFlv() {
        return flv;
    }
    
    public boolean hasSwf() {
        return bmlswf;
    }
}
