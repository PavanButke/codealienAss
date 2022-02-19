# We need to write a data sequence transmitter. This transmitter user phonetics to send
# numerical data. It works as follows:
# For input string of number, it returns the string of number which is of following format:
# (<numberOfTimesTheNumberRepeates><theNumber>){loops for each input digit
# sequence}
# Examples:
# Input data: 1211145567998 -> Output Data: 111231142516172918
# Input data: 1110038 -> Output Data: 31201318
# Input data: 110019 -> Output Data: 21201119

def phonetics(line):
    result = {}
    i = 0
    while i < len(line):
        j = i + 1
        cnt = 1
        while j < len(line) and line[i] == line[j]:
            cnt += 1
            j += 1
        result[line[i]] = cnt
        i = j

    return [str(val) + key for key, val in result.items()]


def main():
    line = input()
    print(''.join(phonetics(line)))

if __name__ == '__main__':
    main()