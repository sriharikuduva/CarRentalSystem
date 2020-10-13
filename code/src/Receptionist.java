import java.util.Date;
import java.util.List;

public class Receptionist extends Account {
    private Date dateJoined;
    private List<Member> memberList;

    public Date getDateJoined() {
        return dateJoined;
    }
    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public List<Member> getMemberList() {
        return memberList;
    }
    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Member> searchMember(String name) { return  memberList; }
}