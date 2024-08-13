Sure, here are the 20 tricky yet basic array practice questions along with test cases for each:

### 1. **Two Sum Problem**
- **Question:** Given an array of integers, find two numbers such that they add up to a specific target number. Return the indices of the two numbers.
- **Test Cases:**
  ```java
  Input: nums = [2, 7, 11, 15], target = 9
  Output: [0, 1]
  
  Input: nums = [3, 2, 4], target = 6
  Output: [1, 2]
  
  Input: nums = [3, 3], target = 6
  Output: [0, 1]
  ```

### 2. **Find the Missing Number**
- **Question:** Given an array containing `n` distinct numbers taken from `0, 1, 2, ..., n`, find the one that is missing from the array.
- **Test Cases:**
  ```java
  Input: nums = [3, 0, 1]
  Output: 2
  
  Input: nums = [0, 1]
  Output: 2
  
  Input: nums = [9,6,4,2,3,5,7,0,1]
  Output: 8
  ```

### 3. **Find Duplicates**
- **Question:** Given an array of integers, some elements appear twice and others appear once. Find all the elements that appear twice.
- **Test Cases:**
  ```java
  Input: nums = [4,3,2,7,8,2,3,1]
  Output: [2, 3]
  
  Input: nums = [1,1,2]
  Output: [1]
  
  Input: nums = [1]
  Output: []
  ```

### 4. **Rotate Array**
- **Question:** Rotate an array of `n` elements to the right by `k` steps.
- **Test Cases:**
  ```java
  Input: nums = [1,2,3,4,5,6,7], k = 3
  Output: [5,6,7,1,2,3,4]
  
  Input: nums = [-1,-100,3,99], k = 2
  Output: [3,99,-1,-100]
  
  Input: nums = [1,2], k = 3
  Output: [2,1]
  ```

### 5. **Intersection of Two Arrays**
- **Question:** Given two arrays, write a function to compute their intersection.
- **Test Cases:**
  ```java
  Input: nums1 = [1,2,2,1], nums2 = [2,2]
  Output: [2]
  
  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
  Output: [4, 9]
  ```

### 6. **Single Number**
- **Question:** Given a non-empty array of integers, every element appears twice except for one. Find that single one.
- **Test Cases:**
  ```java
  Input: nums = [2,2,1]
  Output: 1
  
  Input: nums = [4,1,2,1,2]
  Output: 4
  
  Input: nums = [1]
  Output: 1
  ```

### 7. **Move Zeroes**
- **Question:** Given an array `nums`, write a function to move all 0's to the end while maintaining the relative order of the non-zero elements.
- **Test Cases:**
  ```java
  Input: nums = [0,1,0,3,12]
  Output: [1,3,12,0,0]
  
  Input: nums = [0,0,1]
  Output: [1,0,0]
  
  Input: nums = [1,0]
  Output: [1,0]
  ```

### 8. **Best Time to Buy and Sell Stock**
- **Question:** Given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day, find the maximum profit you can achieve.
- **Test Cases:**
  ```java
  Input: prices = [7,1,5,3,6,4]
  Output: 5
  
  Input: prices = [7,6,4,3,1]
  Output: 0
  
  Input: prices = [1,2]
  Output: 1
  ```

### 9. **Contains Duplicate**
- **Question:** Given an array of integers, find if the array contains any duplicates.
- **Test Cases:**
  ```java
  Input: nums = [1,2,3,1]
  Output: true
  
  Input: nums = [1,2,3,4]
  Output: false
  
  Input: nums = [1,1,1,3,3,4,3,2,4,2]
  Output: true
  ```

### 10. **Product of Array Except Self**
- **Question:** Given an array `nums` of `n` integers where `n > 1`, return an array output such that output[i] is equal to the product of all the elements of `nums` except `nums[i]`.
- **Test Cases:**
  ```java
  Input: nums = [1,2,3,4]
  Output: [24,12,8,6]
  
  Input: nums = [0,0]
  Output: [0,0]
  
  Input: nums = [1,0]
  Output: [0,1]
  ```

### 11. **Maximum Subarray**
- **Question:** Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
- **Test Cases:**
  ```java
  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  Output: 6
  
  Input: nums = [1]
  Output: 1
  
  Input: nums = [5,4,-1,7,8]
  Output: 23
  ```

### 12. **Find All Numbers Disappeared in an Array**
- **Question:** Given an array of integers where `1 ≤ a[i] ≤ n` (n = size of array), some elements appear twice and others appear once. Find all the elements of `[1, n]` inclusive that do not appear in this array.
- **Test Cases:**
  ```java
  Input: nums = [4,3,2,7,8,2,3,1]
  Output: [5, 6]
  
  Input: nums = [1,1]
  Output: [2]
  
  Input: nums = [2,2]
  Output: [1]
  ```

### 13. **Majority Element**
- **Question:** Given an array of size `n`, find the majority element. The majority element is the element that appears more than `⌊ n/2 ⌋` times.
- **Test Cases:**
  ```java
  Input: nums = [3,2,3]
  Output: 3
  
  Input: nums = [2,2,1,1,1,2,2]
  Output: 2
  
  Input: nums = [1]
  Output: 1
  ```

### 14. **Find the Duplicate Number**
- **Question:** Given an array `nums` containing `n + 1` integers where each integer is between `1` and `n` (inclusive), find the duplicate number.
- **Test Cases:**
  ```java
  Input: nums = [1,3,4,2,2]
  Output: 2
  
  Input: nums = [3,1,3,4,2]
  Output: 3
  
  Input: nums = [1,1]
  Output: 1
  ```

### 15. **Merge Sorted Array**
- **Question:** Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.
- **Test Cases:**
  ```java
  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
  Output: [1,2,2,3,5,6]
  
  Input: nums1 = [1], m = 1, nums2 = [], n = 0
  Output: [1]
  
  Input: nums1 = [0], m = 0, nums2 = [1], n = 1
  Output: [1]
  ```

### 16. **Pascal's Triangle**
- **Question:** Given a non-negative integer `numRows`, generate the first `numRows` of Pascal's triangle.
- **Test Cases:**
  ```java
  Input: numRows = 5
  Output: [
    [1],
    [1,1],
    [1,2,1],
    [1,3,3,1],
    [1,4,6,4,1]
  ]
  
  Input: numRows = 1
  Output: [
    [1]
 

 ]
  
  Input: numRows = 3
  Output: [
    [1],
    [1,1],
    [1,2,1]
  ]
  ```

### 17. **Maximum Product Subarray**
- **Question:** Find the contiguous subarray within an array (containing at least one number) which has the largest product.
- **Test Cases:**
  ```java
  Input: nums = [2,3,-2,4]
  Output: 6
  
  Input: nums = [-2,0,-1]
  Output: 0
  
  Input: nums = [-2,3,-4]
  Output: 24
  ```

### 18. **Find Peak Element**
- **Question:** A peak element is an element that is greater than its neighbors. Given an input array `nums`, where `nums[i] ≠ nums[i+1]`, find a peak element and return its index.
- **Test Cases:**
  ```java
  Input: nums = [1,2,3,1]
  Output: 2
  
  Input: nums = [1,2,1,3,5,6,4]
  Output: 5 or 1 (both are correct)
  
  Input: nums = [1]
  Output: 0
  ```

### 19. **Third Maximum Number**
- **Question:** Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number.
- **Test Cases:**
  ```java
  Input: nums = [3,2,1]
  Output: 1
  
  Input: nums = [1,2]
  Output: 2
  
  Input: nums = [2,2,3,1]
  Output: 1
  ```

### 20. **H-Index**
- **Question:** Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.
- **Test Cases:**
  ```java
  Input: citations = [3,0,6,1,5]
  Output: 3
  
  Input: citations = [1,3,1]
  Output: 1
  
  Input: citations = [0]
  Output: 0
  ```

These questions and test cases should help you practice and understand array manipulations and problem-solving skills in Java.