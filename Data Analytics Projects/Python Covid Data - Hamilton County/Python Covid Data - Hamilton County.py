##Make sure to pip install these packages as well
##Also make sure to add the file from the link emailed earlier to the working directory.


import sys; sys.path
from datetime import date
import pandas
import os
import pandas as pd
import matplotlib.pyplot as plt
##Print the current working directory
print("Current working directory: {0}".format(os.getcwd()))

print(os.getcwd())

os.chdir("D:\CodingProjects\Thomas' Projects\Thomas-Projects\Python Covid Data - Hamilton County")

print(os.getcwd())

df = pandas.read_csv('covid19_tn_hamilton - hchd_daily.csv', index_col='deaths_new', parse_dates=['date'])
print(df)


df = pd.DataFrame(df, columns=['date', 'cases_new'])

df.plot(y = 'cases_new' , x = 'date', kind = 'scatter')

df.plot(y = 'cases_new' , x = 'date', kind = 'line')

df.plot(y = 'cases_new' , x = 'date', kind = 'bar')

plt.xlabel("Dates")

plt.ylabel("Case Counts")

plt.title("Covid Cases In Hamilton County By Date")

plt.show()