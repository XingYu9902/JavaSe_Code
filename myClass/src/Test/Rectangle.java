package Test;

public class Rectangle {
        private double height;
        private double width;
        private double area;
        private String color;

        public double getHeight(){
            return height;
        }
        public void setHeight(double height) {
            this.height=height;

        }
        public double getWidth(){
            return width;
        }
        public void setWidth(double width) {
            this.width=width;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color=color;
        }
        public Rectangle(double width,double height){
            this.setHeight(height);
            this.setWidth(width);
        }
        public double getArea(){
            double area = height * width;
            return area;
        }
}
