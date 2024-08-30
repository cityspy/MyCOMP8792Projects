public class Frog {
    private int id = -1;   // -1 used to indicate it has not been set
    private String name = "Name not set";
    private int age = 0;   // Initial age in days

    // Default constructor
    public Frog() {
        // No code in the body of the constructor
    }

    // Constructor with parameters
    public Frog(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    // Method to determine the age group of the frog
    public String ageGroup() {
        if (age >= 0 && age <= 20) {
            return "Age group is young";
        } else if (age >= 21 && age <= 50) {
            return "Age group is juvenile";
        } else {
            return "Age group is adult";
        }
    }

    // Method to alter the name based on the translation table
    public String alterName() {
        StringBuilder alteredName = new StringBuilder();
        for (char c : name.toCharArray()) {
            switch (c) {
                case 'a': alteredName.append('e'); break;
                case 'n': alteredName.append('e'); break;
                case 'r': alteredName.append('a'); break;
                case 'F': alteredName.append('a'); break;
                case 'd': alteredName.append('i'); break;
                default: alteredName.append(c); break;
            }
        }
        return alteredName.toString();
    }

    // Method to determine which frog's name comes first alphabetically
    public Frog firstAlphabetically(Frog other) {
        return (this.name.compareTo(other.name) < 0) ? this : other;
    }

    // Method to shift the frog's name by a given number of characters in the alphabet
    public String shiftName(int shift) {
        StringBuilder shiftedName = new StringBuilder();
        for (char c : name.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                shiftedName.append((char) ('a' + (c - 'a' + shift) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                shiftedName.append((char) ('A' + (c - 'A' + shift) % 26));
            } else {
                shiftedName.append(c);  // Non-alphabet characters remain unchanged
            }
        }
        return shiftedName.toString();
    }

    // Updated toString method excluding the age line
    @Override
    public String toString() {
        return "**** Start of print method ****\n"
                + "Frog's name is " + name + "\n"
                + "Id is " + id;
        // Removed the age line from here
    }
}
