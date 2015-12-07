package koreatech.cse.domain;

/**
 * Created by GilHwan on 2015-12-01.
 */
public class San {
    private String mntname;
    private String mntSname;
    private String mntHigh;
    private String mntAdmin;
    private String mntAdminNum;
    private String mntSummary;
    private String mntDetails;
    private String mntTransport;
    private String mntTourismInf;
    private String mntEtcCourse;
    private String pa;
    private String ts;
    private String tm;

    public String getMntEtcCourse() {
        return mntEtcCourse;
    }

    public void setMntEtcCourse(String mntEtcCourse) {
        this.mntEtcCourse = mntEtcCourse;
    }

    public String getMntTransport() {
        return mntTransport;
    }

    public void setMntTransport(String mntTransport) {
        this.mntTransport = mntTransport;
    }

    public String getMntTourismInf() {
        return mntTourismInf;
    }

    public void setMntTourismInf(String mntTourismInf) {
        this.mntTourismInf = mntTourismInf;
    }



    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getMntname() {
        return mntname;
    }

    public void setMntname(String mntname) {
        this.mntname = mntname;
    }

    public String getMntSname() {
        return mntSname;
    }

    public void setMntSname(String mntSname) {
        this.mntSname = mntSname;
    }

    public String getMntHigh() {
        return mntHigh;
    }

    public void setMntHigh(String mntHigh) {
        this.mntHigh = mntHigh;
    }

    public String getMntAdmin() {
        return mntAdmin;
    }

    public void setMntAdmin(String mntAdmin) {
        this.mntAdmin = mntAdmin;
    }

    public String getMntAdminNum() {
        return mntAdminNum;
    }

    public void setMntAdminNum(String mntAdminNum) {
        this.mntAdminNum = mntAdminNum;
    }

    public String getMntSummary() {
        return mntSummary;
    }

    public void setMntSummary(String mntSummary) {
        this.mntSummary = mntSummary;
    }

    public String getMntDetails() {
        return mntDetails;
    }

    public void setMntDetails(String mntDetails) {
        this.mntDetails = mntDetails;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "San{" +
                "mntname='" + mntname + '\'' +
                ", mntSname='" + mntSname + '\'' +
                ", mntHigh='" + mntHigh + '\'' +
                ", mntAdmin='" + mntAdmin + '\'' +
                ", mntAdminNum='" + mntAdminNum + '\'' +
                ", mntSummary='" + mntSummary + '\'' +
                ", mntDetails='" + mntDetails + '\'' +
                ", mntTransport='" + mntTransport + '\'' +
                ", mntTourismInf='" + mntTourismInf + '\'' +
                ", mntEtcCourse='" + mntEtcCourse + '\'' +
                ", pa='" + pa + '\'' +
                ", ts='" + ts + '\'' +
                ", tm='" + tm + '\'' +
                '}';
    }
}
