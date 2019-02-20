package lesson_5.computer;

import java.text.MessageFormat;

public class CPU {

    private   String manufacturer; //производитель
    private int clockFrequencyExternal; //  внешняя тактовая частота
    private int clockFrequencyInner; // внутреняя тактовая частота
    private int bitDepth; // разрядность
//    private int cacheMemory; // кэш память
//    private int TDP ; // TDP (Thermal Design Power) тепловыделение
//    private int ACP ; // Average CPU Power энергопотребление

    public  String getManufacturer()
    {
        return manufacturer;
    }
    public  void setManufacturer( String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public  int getClockFrequencyExternal()
    {
        return clockFrequencyExternal;
    }
    public  void setClockFrequencyExternal( int clockFrequencyExternal)
    {
        this.clockFrequencyExternal = clockFrequencyExternal;
    }

    public  int getClockFrequencyInner()
    {
        return clockFrequencyInner;
    }
    public  void setClockFrequencyInner( int clockFrequencyInner)
    {
        this.clockFrequencyInner = clockFrequencyInner;
    }
    public  int getBitDepth()
    {
        return bitDepth;
    }
    public  void setBitDepth( int bitDepth)
    {
        this.bitDepth = bitDepth;
    }

    public  void printInfoCPU(){
        System.out.println(MessageFormat.format("производитель : {0}, внешняя тактовая частота : {1},  внутреняя тактовая частота{2}, разрядность{3} ",manufacturer, clockFrequencyExternal, clockFrequencyInner, bitDepth ));

    }

}
