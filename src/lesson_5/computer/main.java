package lesson_5.computer;

public class main {

    public static void main(String[] args) {

        Desktop[] desktops = new Desktop[4];
        for (int i = 0; i < desktops.length ; i++) {
            //  public Desktop(String cpuManufacturer, int cpuClockFrequencyExternal, int cpuClockFrequencyInner, int cpuBitDepth, String kManufacturer, String kColor, String kConstructiveType) {
             desktops[i] = new Desktop("Тайланд" , 12*i, 10*i, 23*i, "Китай", "черный", "еее" );

        }

        desktops[3] = new Desktop();

        for (Desktop desktop:desktops
             ) {
            desktop.printInfoDesktop();
        }

    }
}
