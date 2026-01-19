package educativeCourse.PassByReference;

public class Celebrity {


        String name;
        int age;

        public Celebrity(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (!(obj instanceof Celebrity) || obj == null)
                return false;

            Celebrity otherCeleb = (Celebrity) obj;
            return name.equals(otherCeleb.name);
        }
    }


