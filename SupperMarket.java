class SupperMarket {
static String supperMarketName= "WalmMart";
static String fruits[] = {"apple", "Orange", "Pear", "Cherry", "Strawberry", "Nectarine", "Grape", "Mango", "Blueberry", "Pomegranate"};
static String biscuits[] = {"parle G", "Nimkin", "Krackjack", "20-20 Cookies", "Monaco-Salted Craker", "Golden Arcs", "Kreams", "Festo", "Hide & Seek Choco Chips", "Hide & Seek Milano"};
static String chocolates[] = {"Nestle", "Amul", "Parle", "Mars", "Ferrero Rocher", "Lotus ", "Campco", "Dairy Milk", "kit cat", "coffe"};
static String groceries[] = {"Dal", "Ghee & oile", "Salt", "Sugar", "Masala&Spices", "Noodles ", "jams& Honey", "jams&Honey", "Tea&Coffee", "Pet Foods"};
static String meat[]= {"Beef", "Chicken", "pork", "Ham", "duck", "Steak", "Veal", "salmi", "pork chop", "Short ribs"};
static String shoe[] = {"Loafer", "sneakers", "oxford shoe", "Boot", "Sandal", "Mule", "Chukka boot", "Dress shoe", "Mary jane", "Wedge"}; 
static String cosmetics [] = {"Lipstick", "perfume", "powder", "lotion", "Gel", "Cream", "Blush", "Henna", "Nail polish", "salve"};
static String electronicDevices[] = {"computer", "Refrigerator", "Transistor", "mobile Phone", "Tablet", "SmartPhome", "Switch", "Laptop", "Oven", "Speaker"};
static String clothes[] = {"Dress", "Sock", "Sweater", "Jacket", "Jeans", "Coat", "Shirt", "Boot", "Bra", "Tie"};
public static void main(String a[]){
System.out.println("welcome to" + supperMarketName);
for(int f = 0;f < fruits.length;f++)
{System.out.println(fruits[f]+ " ");
	
}
for(int b = 0; b < biscuits.length;b++){
	System.out.println(biscuits[b] + "  ");
}
System.out.println("------------------------------------------------------");
for(int c = 0; c <chocolates.length;c++){
	System.out.println(chocolates[c] + "  ");
}
System.out.println("-------------------------------------------------------");
for(int g = 0; g < groceries.length;g++){
	System.out.println(groceries[g] + "  ");
}
System.out.println("-------------------------------------------------------");
for(int m = 0; m < meat.length;m++){
	System.out.println(meat[m] + "  ");
}
System.out.println("-------------------------------------------------------");
for(int s = 0; s < shoe.length;s++){
	System.out.println(shoe[s] + "  ");
}
System.out.println("-------------------------------------------------------");
for(int t = 0; t < cosmetics.length;t++){
	System.out.println(cosmetics[t] + "  ");
}
System.out.println("-------------------------------------------------------");
for(int e = 0; e < electronicDevices.length;e++){
	System.out.println(electronicDevices[e] + "  ");
}
System.out.println("-------------------------------------------------------");
for(int l = 0; l < clothes.length;l++){
	System.out.println(clothes[l] + "  ");
}
}
}