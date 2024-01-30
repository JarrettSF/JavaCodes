class Solution {
    public int[] twoSum(int[] nums, int target) {

//outer loop to loop through all the elements in nums array starting at the first element
        for (int i = 0; i < nums.length; i++){

//inner loop to loop through all element in the array starting at the second element
            for (int j = i + 1; j < nums.length; j++){

//if statement to add the first and second element indices through each iteration of the loops
                if (nums[i] + nums[j] == target){


//returns the solution which is the two indices that equal the target value
                    return new int[]{i, j};

                }

            }

        }
        //final return statement
        return nums;
    }

}

/*
example

[5,8,9,6]

target = 11

*/

//constraints
//nums.length is between 2 and 10,000
// num [i] is between negative 1b and positive 1b
// target is between negative 1b and positive 1b