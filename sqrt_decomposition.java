import math
def build_sqrt_decomposition(arr):
    n = len(arr)
    block_size = int(math.sqrt(n)) + 1
    num_blocks = (n + block_size - 1) // block_size
    blocks = [float('-inf')] * num_blocks
    for i in range(n):
        block_idx = i // block_size
        blocks[block_idx] = max(blocks[block_idx], arr[i])
    return blocks, block_size
def query_max(arr, blocks, block_size, left, right):
    max_val = float('-inf')
    while left <= right:
        if left % block_size == 0 and left + block_size - 1 <= right:
            max_val = max(max_val, blocks[left // block_size])
            left += block_size
        else:
            max_val = max(max_val, arr[left])
            left += 1
    return max_val
def find_max_in_range(arr, left, right):
    if left < 0 or right >= len(arr) or left > right:
	pass
    else:
        blocks, block_size = build_sqrt_decomposition(arr)
        max_val = query_max(arr, blocks, block_size, left, right)
        return max_val
arr = list(map(int,input().split()))
left = int(input())
right = int(input())
max_val = find_max_in_range(arr, left, right)
if max_val is not None:
    print(max_val)
else:
    print("Invalid query range")
