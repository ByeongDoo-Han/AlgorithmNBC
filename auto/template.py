# -*- coding: utf-8 -*-
import os

# ----------------------------------------------------------------------------------
print('------------------------------------------------------------')
print('[문제번호][문제 이름][알고리즘 분류]를 복붙 후 ENTER 2번 눌러주세요.')
print('------------------------------------------------------------')

datas = []

while True:
    data = input().split()

    if data:
        datas.append(data)
    else:
        input('위 문제들로 디렉토리를 생성하겠어요? (ENTER)')
        break

for data in datas:
    num = data.pop(0).zfill(5)
    category = data.pop()
    title = ' '.join(data)
    title_bar = title.replace(' ', '_')

    problem = f"{num}-{title_bar}"
    path = f"./{category}/{problem}"

    readme = f"# {str(num)} {title}\nhttps://school.programmers.co.kr/learn/courses/30/lessons/{num}"

# ----------------------------------------------------------------------------------

    # 디렉토리 생성
    if not os.path.exists(path):
        os.makedirs(path)
        # 개별 파일 생성
        members = ['kyeonghwa', 'taewoong',
                   'jieun', 'jaehyeok', 'sol', 'byeongdoo']

        for member in members:
            if member == 'taewoong':
                filepath = os.path.join(path, f'{problem}-{member}.java')
                fid = open(filepath, 'w', encoding='utf8')
                fid.write(
                    f'// git commit -m "code: Solve programmers {num} {title} ({member})"')
            elif member == 'kyeonghwa':
                filepath = os.path.join(path, f'{problem}-{member}.py')
                fid = open(filepath, 'w', encoding='utf8')
                fid.write(
                    f'// git commit -m "code: Solve programmers {num} {title} ({member})"')
            else:
                filepath = os.path.join(path, f'{problem}-{member}.java')
                fid = open(filepath, 'w', encoding='utf8')
                fid.write(
                    f'// git commit -m "code: Solve programmers {num} {title} ({member})"')
            fid.close()

        # README 생성
        md_path = os.path.join(path, 'README.md')
        md_fid = open(md_path, 'w', encoding='utf8')
        md_fid.write(readme)
        md_fid.close()

        print(f'{num} 디렉토리 생성 끝!')

    else:
        print(f'{num} 이미 존재하는 디렉토리입니다.')
