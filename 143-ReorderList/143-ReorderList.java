// Last updated: 24/09/2026, 13:36:11
1import java.util.HashMap;
2import java.util.Map;
3
4class LRUCache {
5
6    private class Node {
7        int key;
8        int val;
9        Node prev;
10        Node next;
11
12        Node(int key, int val) {
13            this.key = key;
14            this.val = val;
15        }
16    }
17
18    private final int capacity;
19    private final Map<Integer, Node> map;
20    private final Node head;
21    private final Node tail;
22
23    public LRUCache(int capacity) {
24        this.capacity = capacity;
25        this.map = new HashMap<>();
26        this.head = new Node(0, 0);
27        this.tail = new Node(0, 0);
28        head.next = tail;
29        tail.prev = head;
30    }
31
32    public int get(int key) {
33        if (!map.containsKey(key)) {
34            return -1;
35        }
36        Node node = map.get(key);
37        remove(node);
38        insertToHead(node);
39        return node.val;
40    }
41
42    public void put(int key, int value) {
43        if (map.containsKey(key)) {
44            Node node = map.get(key);
45            node.val = value;
46            remove(node);
47            insertToHead(node);
48        } else {
49            if (map.size() == capacity) {
50                Node lru = tail.prev;
51                map.remove(lru.key);
52                remove(lru);
53            }
54            Node newNode = new Node(key, value);
55            map.put(key, newNode);
56            insertToHead(newNode);
57        }
58    }
59
60    private void remove(Node node) {
61        node.prev.next = node.next;
62        node.next.prev = node.prev;
63    }
64
65    private void insertToHead(Node node) {
66        node.next = head.next;
67        node.next.prev = node;
68        head.next = node;
69        node.prev = head;
70    }
71}