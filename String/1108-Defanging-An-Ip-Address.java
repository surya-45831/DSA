// Problem Number: 1108
// Problem Name: Defanging an IP Address
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}