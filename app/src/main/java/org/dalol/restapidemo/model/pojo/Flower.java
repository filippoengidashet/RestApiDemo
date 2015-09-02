package org.dalol.restapidemo.model.pojo;

public class Flower {

    public String mCategory, mInstructions, mPhoto, mName;
    public double mPrice;
    public int mProductId;

    private Flower(Builder builder){
        mCategory = builder.mCategory;
        mInstructions = builder.mInstructions;
        mPhoto = builder.mPhoto;
        mName = builder.mName;
        mPrice = builder.mPrice;
        mProductId = builder.mProductId;
    }

    public static class Builder {

        private String mCategory, mInstructions, mPhoto, mName;
        private double mPrice;
        private int mProductId;

        public Builder setCategory(String category) {
            mCategory = category;
            return Builder.this;
        }

        public Builder setInstructions(String instructions) {
            mInstructions = instructions;
            return Builder.this;
        }

        public Builder setPhoto(String photo) {
            mPhoto = photo;
            return Builder.this;
        }

        public Builder setName(String name) {
            mName = name;
            return Builder.this;
        }

        public Builder setPrice(double price) {
            mPrice = price;
            return Builder.this;
        }

        public Builder setProductId(int productId) {
            mProductId = productId;
            return Builder.this;
        }

        public Flower build() {
            return new Flower(Builder.this);
        }
    }
}
