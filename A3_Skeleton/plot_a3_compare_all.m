close;
clear;
clc;

%A = importdata('data_linear_vs_log.txt');
A=[
83998200, 76004500, 76008600, 75992700, 75007800, 74990700, 74975600, 75000000, 75980900, 75000100 ;
50995600, 50655400, 49989700, 51018600, 50990500, 50987800, 52000600, 50995300, 50986600, 50999700;
59035628700, 58418715200, 59530010300, 58106297400, 58968251800, 58057675700, 57873439800, 58750647400, 59438866800, 59534974000;
26550256000, 27933538600, 27550949300, 26624421500, 27533397800, 27283928000, 27542607300, 27481742900, 27010846300, 27718132500;
];

plot(A(1,:), 'LineWidth',4);

hold on;
plot(A(2,:), 'LineWidth',2);

hold on;
plot(A(3,:), 'LineWidth',2);

hold on;
plot(A(4,:), 'LineWidth',2);
% set(gca,'XTickLabel',A(:,1));

set(gca, 'linewidth', 2);
set(gca, 'fontsize', 20);


leg = legend({'Merge Sort', 'Heap Sort', 'Selection Sort', 'Insertion Sort'},'Location','Northwest','FontSize',20);

xlabel('Input size n (50000 + n * 10)') 
ylabel('Runtime') 
%xticks(0:1000000:10 * 1000000)

ax = gca;
ax.FontSize = 20;
til = title('Runtime in nanoseconds','FontSize',40);
til.FontSize = 20;
% ax.YRuler.Exponent = 0;
% set(gca,'XTickLabel',A(:,1));
% ax.XRuler.Exponent = 0;
% ax.XRuler.TickLabelFormat = '%e';
% set(gca,'YTickLabel',A(:,1));

% ax.XTickLabel=num2cell(A(:,1));
% ax.XTickLabel= (A(:,1)');


% p = polyfit(A(:,1),A(:,2),1);   % p returns 2 coefficients fitting r = a_1 * x + a_2
% r = p(1) .* A(:,1) + p(2); % compute a new vector r that has matching datapoints in x

% now plot both the points in y and the curve fit in r
% hold on;
% a = plot(A(:,1), r, '-');
% a.LineWidth=2;
% a.LineStyle = '--';
% hold on;
leg = legend({'Merge Sort', 'Heap Sort'},'Location','Northwest','FontSize',20);
size(get(gca, 'XTick'));
size(get(gca, 'YTick'));

ax.FontSize = 20;