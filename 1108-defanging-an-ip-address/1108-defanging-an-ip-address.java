class Solution {
    public String defangIPaddr(String address) {
        String add = address.replace(".","[.]");
        return add;
    }
}