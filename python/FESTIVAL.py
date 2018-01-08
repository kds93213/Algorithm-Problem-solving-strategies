#!/usr/bin/env python3

def loop(input_str):
    a = input_str.split()
    teams = int(a[1])
    input_str = input().split()
    costs = list(map(int, input_str))

    cost_avg_min = float('inf')

    for days in range(teams, len(costs)):
        for i in range(len(costs) - days):
            cost = 0
            for j in range(i, i + days):
                cost += costs[j]
            cost_avg_min = min(cost_avg_min, cost/days)

    print(cost_avg_min)


if __name__ == '__main__':
    times = int(input())
    for i in range(times):
        loop(input())
