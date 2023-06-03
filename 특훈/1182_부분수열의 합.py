def recur(depth, sum_value):
    global count
    if depth == n:
        if sum_value == s:
            count += 1
        return

    recur(depth + 1, sum_value + arr[depth])
    recur(depth + 1, sum_value)


n, s = map(int, input().split())
arr = list(map(int, input().split()))
count = -1 if s == 0 else 0

recur(0, 0)
print(count)
