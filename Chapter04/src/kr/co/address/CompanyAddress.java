package kr.co.address;

public class CompanyAddress extends Address implements Comparable<CompanyAddress> {
    private String companyName;

    public CompanyAddress(String name, String city, String detailedAddress, String zipcode, String companyName) {
        super(name, city, detailedAddress, zipcode);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "회사 주소: " + super.toString() + ", " + companyName + "]";
    }

    @Override
    public int compareTo(CompanyAddress o) {
        return this.getZipcode().compareTo(o.getZipcode());
    }
}