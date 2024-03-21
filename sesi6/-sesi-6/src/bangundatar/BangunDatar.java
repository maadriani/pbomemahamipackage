package bangundatar;

public abstract class BangunDatar {
    private String name;

    public abstract double luas ();
    public abstract double keliling();

    public void getInfo() {
        System.out.println("bangun Datar"+name);
        System.out.println("luas:"+luas());
        System.out.println("keliling:"+keliling());
    }

    private void setName(String name) {
        this.name = name;
    }

    protected BangunDatar(String name) {
        this.setName(name);
    }
    
}
