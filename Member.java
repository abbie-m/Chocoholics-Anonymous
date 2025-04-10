public class Member {
    private String name;
    private String memberNumber;
    private String address;
    private String city;
    private String state;
    private String zip;
    private boolean isSuspended;

    public Member(String name, String memberNumber, String address, String city, String state, String zip, boolean isSuspended) {
        this.name = name;
        this.memberNumber = memberNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.isSuspended = isSuspended;
    }
    
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getMemberNumber() {
    return memberNumber;
}

public void setMemberNumber(String memberNumber) {
    this.memberNumber = memberNumber;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public String getState() {
    return state;
}

public void setState(String state) {
    this.state = state;
}

public String getZip() {
    return zip;
}

public void setZip(String zip) {
    this.zip = zip;
}

public boolean isSuspended() {
    return isSuspended;
}

public void setSuspended(boolean suspended) {
    isSuspended = suspended;
}
    // Getters and setters omitted for brevity
}


