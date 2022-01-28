def kth_permutation(n, k):
  permutation = []
  unused = list(range(1, n + 1))
  fact = [1]*(n + 1)
  for i in range(1, n + 1):
    fact[i] = fact[i-1] * i
  
  k -= 1 # starts at 0
  while n > 0:
    part_length = fact[n]//n
    i = k//part_length
    permutation.append(unused[i])
    unused.pop(i)
    n -= 1
    k %= part_length
  return ''.join(map(str, permutation))


print(kth_permutation(10, 999))
  