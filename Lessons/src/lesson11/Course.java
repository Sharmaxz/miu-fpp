package lesson11;

import java.util.Objects;

public class Course {
    String cid;
    String cname;

    public Course(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course [cid=" + cid + ", cname=" + cname + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(cid, course.cid) && Objects.equals(cname, course.cname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cname);
    }
}
