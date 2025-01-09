public class MegaStore {

        public enum DiscountType {
            Standard,
            Seasonal,
            Weight;
        }

        public static double getDiscountedPrice(double cartWeight,
                                                double totalPrice,
                                                DiscountType discountType) {
            if(discountType == null){
                throw new IllegalArgumentException("Discount type cannot be null.");
            }
            //double discountedPrice = totalPrice;

            if(discountType == DiscountType.Standard){
                return totalPrice * 0.90;
            }else if (discountType == DiscountType.Seasonal){
                return totalPrice * 0.75;
            }else if(discountType == DiscountType.Weight){

                if(cartWeight > 10){
                    return totalPrice * 0.82;
                } else {
                    return totalPrice * 0.88;
                }
            } else {

                throw new UnsupportedOperationException("Waiting to be implemented.");
            }
            //return discountedPrice;
        }

        public static void main(String[] args) {
            System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
            System.out.println(getDiscountedPrice(8, 200, DiscountType.Weight));
            System.out.println(getDiscountedPrice(10, 150, DiscountType.Standard));
            System.out.println(getDiscountedPrice(5, 300, DiscountType.Seasonal));
        }
    }
