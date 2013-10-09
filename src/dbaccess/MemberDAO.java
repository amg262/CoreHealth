
package dbaccess;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class MemberDAO implements I_MemberDAO {
    
    
    private I_DBAccessor db;
    private static final String MySQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL_PATH = "jdbc:mysql://localhost:3306/core_health";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";

    private static final String RETRIEVE_ALL_MEMBERS =
            "SELECT * " +
            "FROM member ;";
                
    /**
     *
     */
    public MemberDAO() {}
    
    
    /**
     *
     * @param db
     */
    public MemberDAO(I_DBAccessor db) {
        this.db = db;
    }
    
    
    @Override
    public void openLocalDBConnection() throws DataAccessException {
        try {
            db.openConnection(MySQL_DRIVER, URL_PATH, USERNAME, PASSWORD);
            
        } catch (IllegalArgumentException iae){
            throw new DataAccessException (iae.getMessage(), iae);
        } catch (ClassNotFoundException cnfe){
            throw new DataAccessException (cnfe.getMessage(), cnfe);
        } catch (SQLException sqle){
            throw new DataAccessException (sqle.getMessage(), sqle);
        }
    }

    @Override
    public List<Member> retrieveAllMemebers() throws DataAccessException {
        this.openLocalDBConnection();
        
        List<Map> rawData = new ArrayList<>();
        List<Member> records = new ArrayList<>();
        
        try {
            rawData = db.retrieveRecords(RETRIEVE_ALL_MEMBERS, true);
        } catch (SQLException sqle){
            throw new DataAccessException (sqle.getMessage(), sqle);
        } catch (Exception e){
            throw new DataAccessException (e.getMessage(), e);
        }
        
        Member member = null;
        
        for (Map map : rawData) {
            member = new Member();
            
            String memberId = map.get("member_id").toString();
            member.setMemberId(new Integer(memberId));
            
            String lastName = map.get("last_name").toString();
            member.setLastName(lastName);
            
            String firstName = map.get("first_name").toString();
            member.setFirstName(firstName);
            
            String address = map.get("address").toString();
            member.setAddress(address);
            
            String city = map.get("city").toString();
            member.setCity(city);
            
            String state = map.get("state").toString();
            member.setState(state);
            
            String zip = map.get("zip").toString();
            member.setZip(zip);
            
            String phone = map.get("phone").toString();
            member.setPhone(phone);
            
            String email = map.get("email").toString();
            member.setEmail(email);
            
            Date joinDate = (Date)map.get("join_date");
            member.setJoinDate(joinDate);
            
            String membershipType = map.get("membership_type").toString();
            member.setMembershipType(membershipType);
            
            String membershipStatus = map.get("membership_status").toString();
            member.setMembershipStatus(membershipStatus);
            
            String membershipPayment = map.get("membership_payment").toString();
            member.setMembershipPayment(membershipPayment);
            
            String freeSession = map.get("free_session").toString();
            member.setFreeSession(freeSession);
            
            records.add(member);
        }
        
        return records;
    }

    @Override
    public Member retreiveMemberById(String memberId) throws DataAccessException {
        this.openLocalDBConnection();
        
        Map record;
        
        try {
            record = db.retrieveRecordByID("member", "member_id",
                                            new Integer(memberId), true);
            
        } catch (SQLException sqle){
            throw new DataAccessException(sqle.getMessage(), sqle);
        } catch (Exception e) {
            throw new DataAccessException(e.getMessage(), e);
        }
        
        Member member = new Member();
        
        member.setMemberId(new Integer(record.get("member_id").toString()));
        member.setLastName(record.get("last_name").toString());
        member.setFirstName(record.get("first_name").toString());
        member.setAddress(record.get("address").toString());
        member.setCity(record.get("city").toString());
        member.setState(record.get("state").toString());
        member.setZip(record.get("zip").toString());
        member.setPhone(record.get("phone").toString());
        member.setEmail(record.get("email").toString());
        
        Date joinDate = (Date)record.get("join_date");
        member.setJoinDate(joinDate);
        
        member.setMembershipType(record.get("membership_type").toString());
        member.setMembershipStatus(record.get("membership_status").toString());
        member.setMembershipPayment(record.get("membership_payment").toString());
        member.setFreeSession(record.get("free_session").toString());
        
        
        return member;
    }

    @Override
    public void saveMember(Member member) throws DataAccessException {
        this.openLocalDBConnection();
        
        List<String> fields;
        List values;
        String tableName = "member";
        
        fields = new ArrayList<>();
        fields.add("last_name");
        fields.add("first_name");
        fields.add("address");
        fields.add("city");
        fields.add("state");
        fields.add("zip");
        fields.add("phone");
        fields.add("email");
        fields.add("join_date");
        fields.add("membership_type");
        fields.add("membership_status");
        fields.add("membership_payment");
        fields.add("free_session");
        
        
        values = new ArrayList();
        values.add(member.getFirstName());
        values.add(member.getLastName());
        values.add(member.getAddress());
        values.add(member.getCity());
        values.add(member.getState());
        values.add(member.getZip());
        values.add(member.getPhone());
        values.add(member.getEmail());
        values.add(member.getJoinDate());
        values.add(member.getMembershipType());
        values.add(member.getMembershipStatus());
        values.add(member.getMembershipPayment());
        values.add(member.getFreeSession());
        
        try {
            if (member.getMemberId() == 0){
                db.insertRecord(tableName, fields, values, true);
                
            } else {
                db.updateRecords(tableName, fields, values, "member_id", member.getMemberId(), true);
            }
            
        } catch (SQLException sqle){
            throw new DataAccessException(sqle.getMessage(), sqle);
        } catch (Exception e){
            throw new DataAccessException(e.getMessage(), e);
        }
    }

    @Override
    public void deleteMember(Member member) throws DataAccessException {
        this.openLocalDBConnection();
        
        try {
            db.deleteRecords("member", "member_id", member.getMemberId(), true);
        } catch (SQLException sqle){
            throw new DataAccessException(sqle.getMessage(), sqle);
        } catch (Exception e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
}
