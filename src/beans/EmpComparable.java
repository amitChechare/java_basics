package beans;

public class EmpComparable implements Comparable<EmpComparable>{

    int id;
    String name;

    public EmpComparable() {
    }

    public EmpComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(EmpComparable emp) {
        return (this.getId() - emp.getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
