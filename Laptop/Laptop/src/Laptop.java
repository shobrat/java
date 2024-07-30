
public class Laptop {
        private final String model;
        private final int ram;
        private final int hdd;
        private final String os;
        private final String color;

        // Конструктор класса
        public Laptop(String model, int ram, int hdd, String os, String color) {
            this.model = model;
            this.ram = ram;
            this.hdd = hdd;
            this.os = os;
            this.color = color;
        }

        public int getRam() {
            return ram;
        }

        public int getHdd() {
            return hdd;
        }

        public String getOs() {
            return os;
        }

        public String getColor() {
            return color;
        }

        // Метод для удобного вывода информации о ноутбуке
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Laptop{");
            sb.append("model='").append(model).append('\'');
            sb.append(", ram=").append(ram);
            sb.append(", hdd=").append(hdd);
            sb.append(", os='").append(os).append('\'');
            sb.append(", color='").append(color).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }