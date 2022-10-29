
file=record.md

grep "\.$" $file | awk -F '|' '{print $3}' |awk -F '.' '{print $1}'| awk '{sum += $1} ;END {print sum}'
#笔记总页数
pages=$( grep "\.$" $file | awk -F '|' '{print $4}' |awk -F '.' '{print $1}'| awk '{sum += $1} ;END {print sum}' )
echo "All the pages is $pages"

egrep "^\[[0-9]{4,4}\]$" $file

newPages=5457
sed -r -i "s/^\[[0-9]{4,4}]$/[$pages]/" $file
echo "统计总页数完成...."
 #sed -r 's/^\([0-9]{1,3}\/[0-9]{1,3}\)$/12345/' record1.md

echo $1


if [[ $1 = 'show' ]]
then
 grep -n "^\s\s\s\s*"  $file  | awk -F '*'  '{print NR " " $2}'
fi

books=$(grep "^\s\s\s\s*" $file | wc -l)
read=$(grep '"book"' $file | wc -l)

echo -n "书籍总数[$books],已经阅读[$read]---"

sed -r -i "s/^\([0-9]{1,3}\/[0-9]{1,3}\)$/($read\/$books)/" $file

egrep  "^\([0-9]{1,3}\/[0-9]{1,3}\)$" $file
