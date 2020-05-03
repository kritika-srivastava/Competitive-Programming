/*Code for constructing node for the next two programs*/
class Node {
    int data;
    Node link;

    public Node() {
        link = null;
        data = 0;
    }

    public Node(int d, Node n) {
        link = n;
        data = d;
    }

    public void setlink(Node n) {
        link = n;
    }

    public void setData(int d) {
        data = d;
    }

    public Node getlink() {
        return link;
    }

    public int getdata() {
        return data;
    }
}
