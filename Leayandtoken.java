import java.util.Scanner;
public class TokenBucket {
public static void main(String[] args) {
int tokens = 0;
int rate = 10;
int capacity = 100;
int[] request = new int[100];
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of requests: "); int n = scanner.nextInt();
System.out.print("Enter no. of packets per request: "); for (int i = 0; i < n; i++) {
request[i] = scanner.nextInt(); }
for (int i = 0; i < n; i++) {
tokens = Math.min(tokens + rate, capacity); if (tokens >= request[i]) {
tokens -= request[i];
System.out.println("Request granted, tokens remaining: " + tokens); } else {
System.out.println("Request denied, not enough tokens: " + tokens); }
}
scanner.close(); }
}

import java.util.Scanner;
public class LeakyBucketAlgorithm { public static void main(String[] args) {
int noOfQueries = 4;
int bucketSize = 10;
int inputPacketSize;
int outputPacketSize = 1; int storedBufferSize = 0; int sizeLeft;
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < noOfQueries; i++) { System.out.print("Input Packet Size: "); inputPacketSize = scanner.nextInt();
sizeLeft = bucketSize - storedBufferSize; if (inputPacketSize <= sizeLeft) {
storedBufferSize += inputPacketSize; } else {
System.out.println("Packet Dropped"); }
System.out.println("Stored Buffer Size: " + storedBufferSize);
storedBufferSize -= outputPacketSize; }
scanner.close(); }
}
