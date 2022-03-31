
import matplotlib.pyplot as pyl

nomes = list(dic.keys())
valores = list(dic.values())

pyl.bar(range(len(dic)), valores, tick_label=nomes)

pyl.show()