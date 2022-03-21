package com.example.lap5;

public class Dount {
        private int resourceId;
        private String name;
        private String description;
        private int price;

        public Dount(int resourceId, String name, String description, int price) {
            this.resourceId = resourceId;
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public int getResourceId() {
            return resourceId;
        }

        public void setResourceId(int resourceId) {
            this.resourceId = resourceId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

    @Override
    public String toString() {
        return "Dount{" +
                "resourceId=" + resourceId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
