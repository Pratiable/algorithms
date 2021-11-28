function solution(n) {
  const ternaryNumber = n.toString(3);
  const reversedNumber = ternaryNumber.toString().split("").reverse().join("");
  return Number.parseInt(reversedNumber, 3);
}
