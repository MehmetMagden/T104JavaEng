package Projects;

public class P03_StorageProgram {


    /*
     * a simple warehouse project
     *
     * It is a warehouse application, which is a system implemented in a working factory.
     *
     * 1-) First of all, the product is defined here. id productName manufacturer quantity unit and shelf (6 fields available)
     *
     * 2-) We will create methods.
     * Product Description ==> The name, manufacturer and unit of the product will be entered. id will be created.
     *
     * ProductList ==> defined products will be listed. If the product quantity and shelf number are not defined, the default value will appear.
     *
     * Product Entry ==> we will enter with the id number of the product we want to log in.
     *
     * Put the product on the shelf ==> we will choose the product from the list and put the product on the shelf according to the id number.
     *
     * product Output ==> we will select the product from the list and we will check out the product. Only quantity changes will be made from the product list here.
     * The number of products cannot be less than 0. When 0, the product description should not be deleted. just let the amount be 0.
     * ===> all the changes we have made will also appear in the list.
     *
     *
         id      name    provider       quantity    unit            shelf
     *------------------------------------------------ --------------
     *  1000    Flour    Hekimoglu       0          bags            null
     *
     * product entry ==> id:1000 product entry :5
     * productList ==>
     *
     * id name generator quantity unit rack
     *------------------------------------------------ --------------
     * or: 5 bags of 1000 flour physicians null
     *
     * Put productRafa ==> id:1000 shelf : shelf1
     * productList ==>
     * id name generator quantity unit rack
     *------------------------------------------------ --------------
     * or: 5 sacks of 1000 flour with Hekimoglu Rack1
     *
     * product output ==> id 1000: product output : 3 (remaining 2 sacks of flour)
     * productList ==>
     * id name generator quantity unit rack
     *------------------------------------------------ --------------
     * or: 2 bags of 1000 flour with Hekimoglu Rack1
     *
     *
     */




}
