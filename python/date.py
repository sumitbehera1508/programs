import datetime

today = datetime.datetime.now

print(f"{today:%B} the {today:%-d}th be with you")