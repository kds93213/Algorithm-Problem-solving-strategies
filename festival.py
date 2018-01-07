for i in range(int(input())):
    team_num = int(input().split()[1])
    cost_list = list(map(int, input().split()))
    available_day = len(cost_list)

    avg_cost = 100.0  # Max value

    if team_num == 1:
        avg_cost = min(cost_list)
        print('{:0.11f}'.format(avg_cost))
        continue
    elif available_day == team_num:
        avg_cost = sum(cost_list)/available_day
        print('{:0.11f}'.format(avg_cost))
        continue
    for start_idx in range(available_day-team_num+1):
        total = sum(cost_list[start_idx:start_idx+team_num])
        avg_cost = min(avg_cost, total / team_num)
        for end_idx in range(start_idx+team_num, available_day):
            total += cost_list[end_idx]
            avg_cost = min(avg_cost, total / (end_idx - start_idx + 1))
    print('{:0.11f}'.format(avg_cost))
