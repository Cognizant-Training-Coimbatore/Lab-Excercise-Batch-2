function reverse(a) {
  return (a === '') ? '' : reverse(a.substr(1)) + a.charAt(0);
}