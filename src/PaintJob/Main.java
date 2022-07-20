package PaintJob;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));


    }

        public static int getBucketCount(double width, double height,
                                         double areaPerBucket, int extraBuckets)
        {
            if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0)
            {
                return -1;
            }
            return (int)Math.ceil((height*width)/areaPerBucket)-extraBuckets;
        }

        public static int getBucketCount(double width, double height, double areaPerBucket){
            return getBucketCount(width, height, areaPerBucket, 0);
        }

        public static int getBucketCount(double area, double areaPerBucket){
            return getBucketCount(area, 1, areaPerBucket); // area=width*height, we can use call second method with area="width" if height is 1
        }
    }

