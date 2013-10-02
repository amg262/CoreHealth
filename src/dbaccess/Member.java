
package dbaccess;

import java.util.Date;

/**
 *
 * Contains all the fields that are in Member table in database
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class Member {
    
    private int memberId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private Date joinDate;
    private String membershipType;
    private String membershipStatus;
    private String membershipPayment;
    private String freeSession;
    
    
    /**
     *
     */
    public Member() {}

    
    /**
     *
     * @param memberId
     */
    public Member(int memberId) {
        this.memberId = memberId;
    }

    /**
     *
     * @param memberId
     * @param lastName
     * @param firstName
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param email
     * @param joinDate
     * @param membershipType
     * @param membershipStatus
     * @param membershipPayment
     * @param freeSession
     */
    public Member(int memberId, String lastName, String firstName, String address,
            String city, String state, String zip, String phone, String email,
            Date joinDate, String membershipType, String membershipStatus,
            String membershipPayment, String freeSession) {
        
        this.memberId = memberId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.joinDate = joinDate;
        this.membershipType = membershipType;
        this.membershipStatus = membershipStatus;
        this.membershipPayment = membershipPayment;
        this.freeSession = freeSession;
    }

    /**
     * @return the memberId
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the joinDate
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * @return the membershipType
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * @param membershipType the membershipType to set
     */
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * @return the membershipStatus
     */
    public String getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * @param membershipStatus the membershipStatus to set
     */
    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    /**
     * @return the membershipPayment
     */
    public String getMembershipPayment() {
        return membershipPayment;
    }

    /**
     * @param membershipPayment the membershipPayment to set
     */
    public void setMembershipPayment(String membershipPayment) {
        this.membershipPayment = membershipPayment;
    }

    /**
     * @return the freeSession
     */
    public String getFreeSession() {
        return freeSession;
    }

    /**
     * @param freeSession the freeSession to set
     */
    public void setFreeSession(String freeSession) {
        this.freeSession = freeSession;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.memberId;
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Member other = (Member) obj;
        if (this.memberId != other.memberId) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nMember\n{" +
                "\nmemberId:  " + memberId + "\nlastName:  " + lastName +
                "\nfirstName:  " + firstName + "\naddress:  " + address +
                "\ncity:  " + city + "\nstate:  " + state + "\nzip:  " + zip +
                "\nphone:  " + phone + "\nemail: " + email +
                "\njoinDate:  " + joinDate + "\nmem_Type:  " + membershipType +
                "\nmem_Status:  " + membershipStatus +
                "\nmem_Payment:  " + membershipPayment +
                "\nfreeSession:  " + freeSession + "\n}\n";
    }

    
    


}
