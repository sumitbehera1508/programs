import tkinter as tk

ui = tk.Tk()

ui.geometry("900x300")

ui.title("My Window")
# photo = tk.PhotoImage(file="D:\programs\python\college_exercise\download.png")
Canvas = tk.Canvas(ui,width=100,height=900,bg="#FFD700")
Canvas.place(x=0,y=0)

var1 = tk.IntVar()
var2 = tk.IntVar()

tk.Label(Canvas,text="gender",bg="#FF1167").grid(row=0,column=0)
tk.Checkbutton(Canvas,text="Male",variable=var1,bg="yellow").grid(row=0,column=1)
tk.Checkbutton(Canvas,text="Female",variable=var2).grid(row=1,column=1)

tk.Label(Canvas,text="First Name").grid(row=4,column=0)
e1 = tk.Entry(Canvas).grid(row=4,column=1)

tk.Label(Canvas,text="Last Name").grid(row=5,column=0)
e2 = tk.Entry(Canvas).grid(row=5,column=1)


destroy = tk.Button(ui,text="delete",command=Canvas.destroy ,cursor="cross",width=5,bg="red")
destroy.place(x=190,y=0)

quit = tk.Button(ui,text="quit",command=ui.destroy,bg="red")
quit.place(x=190,y=100)
ui.mainloop()