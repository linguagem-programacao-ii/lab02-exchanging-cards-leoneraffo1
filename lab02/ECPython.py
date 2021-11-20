while True:
    alice, betty = input().split()

    if alice == "0" and betty == '0': # Para o programa
        break
    
    # define quais cartas cada uma tem
    fAlice = [int(x) for x in input().split()]
    fBetty = [int(x) for x in input().split()]

    alice = set(fAlice)
    betty = set(fBetty)
    c = betty
    
    if len(alice) < len(betty): # condicao de troca
        c = alice
        alice = betty
    
    c = [x for x in c if x not in alice] # total de trocas
    print(len(c))