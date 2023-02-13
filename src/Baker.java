public class Baker {
    private int bakerId;
    private String bakerCompanyName;
    private String bakerCountry;
    private String bakerWorkTime;

    public Baker(){
    this.bakerId = 1;
    this.bakerCompanyName = "Inc";
    this.bakerCountry = "Ungaliq";
    this.bakerWorkTime = "24/7";
    }

    public Baker(int bakerId, String bakerCompanyName, String bakerCountry, String bakerWorkTIme) {
        this.bakerId = bakerId;
        this.bakerCompanyName = bakerCompanyName;
        this.bakerCountry = bakerCountry;
        this.bakerWorkTime = bakerWorkTIme;
    }

    public int getBakerId() {
        return bakerId;
    }

    public void setBakerId(int bakerId) {
        this.bakerId = bakerId;
    }

    public String getBakerCompanyName() {
        return bakerCompanyName;
    }

    public void setBakerCompanyName(String bakerCompanyName) {
        this.bakerCompanyName = bakerCompanyName;
    }

    public String getBakerCountry() {
        return bakerCountry;
    }

    public void setBakerCountry(String bakerCountry) {
        this.bakerCountry = bakerCountry;
    }

    public String getBakerWorkTIme() {
        return bakerWorkTime;
    }

    public void setBakerWorkTIme(String bakerWorkTIme) {
        this.bakerWorkTime = bakerWorkTIme;
    }

    @Override
    public String toString() {
        return "Baker{" +
                "bakerId=" + bakerId +
                ", bakerCompanyName='" + bakerCompanyName + '\'' +
                ", bakerCountry='" + bakerCountry + '\'' +
                ", bakerWorkTIme='" + bakerWorkTime + '\'' +
                '}';
    }

    public void add(Baker bakers) {
    }
}
