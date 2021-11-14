package guru.qa.distill;

public class Suite {

    int volumeAlembic;
    int heightSideBar;
    int volumeRefrigerator;

    public Suite() {
        volumeAlembic = 9;
        heightSideBar = 10;
        volumeRefrigerator = 1;
    }

    public Suite(int volumeAlembic, int heightSideBar, int volumeRefrigerator) {
        this.volumeAlembic = volumeAlembic;
        this.heightSideBar = heightSideBar;
        this.volumeRefrigerator = volumeRefrigerator;
    }

    public int getVolumeAlembic() {
        return volumeAlembic;
    }

    public void setVolumeAlembic(int volumeAlembic) {
        this.volumeAlembic = volumeAlembic;
    }

    public int getHeightSideBar() {
        return heightSideBar;
    }

    public void setHeightSideBar(int heightSideBar) {
        this.heightSideBar = heightSideBar;
    }

    public int getVolumeRefrigerator() {
        return volumeRefrigerator;
    }

    public void setVolumeRefrigerator(int volumeRefrigerator) {
        this.volumeRefrigerator = volumeRefrigerator;
    }

    static class Gifts {

        static int heightDiopter = 50;
        static int lengthSiliconeTube = 5;
        static int yeastPackage = 1;

       public void sendGifts() {
           System.out.println("\n\nК выбранному Вами оборудованию от нас вы также получаете в подарок отличный диоптр " +
                   "на " + heightDiopter + " см, удлинительный шланг длиной " + lengthSiliconeTube + " м, " +
                   "а также " + yeastPackage + " упаковку хороших дрожжей, чтобы иметь возможность в короткие " +
                   "сроки запустить свою домашнюю винокурню!");
       }
    }

    public void getDefaultSuite() {
        System.out.print("- перегонный куб объемом " + volumeAlembic + " л;"
                + System.lineSeparator() + "- царга высотой " + heightSideBar + " см;"
                + System.lineSeparator() + "- холодильник объемом " + volumeRefrigerator + " л.");
    }

    public void getSuite(int volumeAlembic, int heightSideBar, int volumeRefrigerator) {
        System.out.print("- перегонный куб объемом " + volumeAlembic + " л;"
                + System.lineSeparator() + "- царга высотой " + heightSideBar + " см;"
                + System.lineSeparator() + "- холодильник объемом " + volumeRefrigerator + " л.");
    }
}
