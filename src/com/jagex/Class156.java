package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class156 implements Runnable {
    static int anInt1958;
    static int anInt1959;
    static Class192 aClass192_1962 = new Class192(128, -2);
    static int anInt1963;
    static HashTable aHashTable1964 = new HashTable(512);
    static int anInt1966;
    static int anInt1967;
    static GLSprite[] aGLSpriteArray1969;
    static int anInt1970;
    private int anInt1956 = 0;
    private int anInt1957;
    private int anInt1960 = 0;
    private Thread aThread1961;
    private InputStream anInputStream1965;
    private IOException anIOException1968;
    private byte[] aByteArray1971;

    Class156(InputStream inputstream, int i) {
        anInputStream1965 = inputstream;
        anInt1957 = 1 + i;
        aByteArray1971 = new byte[anInt1957];
        aThread1961 = new Thread(this);
        aThread1961.setDaemon(true);
        aThread1961.start();
    }

    static int method1705(int i, int i_3_) {
        if (i != -983162425) {
            method1705(73, -108);
        }
        anInt1970++;
        return i_3_ >>> 7;
    }

    public static void method1707(int i) {
        aHashTable1964 = null;
        if (i != 512) {
            aClass192_1962 = null;
        }
        aGLSpriteArray1969 = null;
        aClass192_1962 = null;
    }

    final boolean method1703(int i, int i_0_) throws IOException {
        anInt1959++;
        if (i_0_ <= 0 || (~i_0_) <= (~anInt1957)) {
            throw new IOException();
        }
        int i_1_ = 125 / ((59 - i) / 40);
        synchronized (this) {
            int i_2_;
            if (anInt1956 > anInt1960) {
                i_2_ = -anInt1956 + (anInt1957 + anInt1960);
            } else {
                i_2_ = anInt1960 - anInt1956;
            }
            if ((~i_0_) < (~i_2_)) {
                if (anIOException1968 != null) {
                    throw new IOException(anIOException1968.toString());
                }
                this.notifyAll();
                return false;
            }
            return true;
        }
    }

    final void method1704(boolean bool) {
        if (bool != false) {
            aByteArray1971 = null;
        }
        anInt1966++;
        anInputStream1965 = new InputStream_Sub1();
    }

    final void method1706(byte b) {
        synchronized (this) {
            if (b > -75) {
                return;
            }
            if (anIOException1968 == null) {
                anIOException1968 = new IOException("");
            }
            this.notifyAll();
        }
        anInt1958++;
        try {
            aThread1961.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }

    public final void run() {
        anInt1963++;
        for (; ; ) {
            int i;
            synchronized (this) {
                for (; ; ) {
                    if (anIOException1968 != null) {
                        return;
                    }
                    if ((~anInt1956) == -1) {
                        i = -1 + (anInt1957 - anInt1960);
                    } else if ((~anInt1960) <= (~anInt1956)) {
                        i = anInt1957 - anInt1960;
                    } else {
                        i = -1 + anInt1956 - anInt1960;
                    }
                    if ((~i) < -1) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            int i_4_;
            try {
                i_4_ = anInputStream1965.read(aByteArray1971, anInt1960, i);
                if (i_4_ == -1) {
                    throw new EOFException();
                }
            } catch (IOException ioexception) {
                synchronized (this) {
                    anIOException1968 = ioexception;
                    break;
                }
            }
            synchronized (this) {
                anInt1960 = (i_4_ + anInt1960) % anInt1957;
            }
        }
    }

    final int method1708(int i, int i_5_, int i_6_, byte[] bs) throws IOException {
        anInt1967++;
        if ((~i_5_) > -1 || (~i_6_) > -1 || i_5_ + i_6_ > bs.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i_7_;
            if ((~anInt1960) <= (~anInt1956)) {
                i_7_ = anInt1960 - anInt1956;
            } else {
                i_7_ = anInt1960 + anInt1957 - anInt1956;
            }
            if (i_7_ < i_5_) {
                i_5_ = i_7_;
            }
            if (i != 1) {
                method1706((byte) 78);
            }
            if ((~i_5_) == -1 && anIOException1968 != null) {
                throw new IOException(anIOException1968.toString());
            }
            if (anInt1957 >= anInt1956 + i_5_) {
                Class311.method3608(aByteArray1971, anInt1956, bs, i_6_, i_5_);
            } else {
                int i_8_ = anInt1957 - anInt1956;
                Class311.method3608(aByteArray1971, anInt1956, bs, i_6_, i_8_);
                Class311.method3608(aByteArray1971, 0, bs, i_8_ + i_6_, i_5_ - i_8_);
            }
            anInt1956 = (i_5_ + anInt1956) % anInt1957;
            this.notifyAll();
            return i_5_;
        }
    }
}
