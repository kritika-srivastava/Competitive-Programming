package Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\ProductOfTheLastKNumbers.java
 * 
 * @author Kritika Srivastava
 * @since February 14, 2025
 *
 *        Link :https://leetcode.com/problems/product-of-the-last-k-numbers/
 */
public class ProductOfTheLastKNumbers {

    List<Integer> numbersProduct;
    int product;

    public ProductOfNumbers() {

        numbersProduct = new ArrayList<>();
        numbersProduct.add(1);

    }

    public void add(int num) {

        if (num == 0) {
            numbersProduct.clear();
            numbersProduct.add(1);
        } else {
            numbersProduct.add(numbersProduct.get(numbersProduct.size() - 1) * num);
        }

    }

    public int getProduct(int k) {
        if (k >= numbersProduct.size()) {
            return 0;
        }
        int ans = numbersProduct.get(numbersProduct.size() - 1) / numbersProduct.get(numbersProduct.size() - k - 1);
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
